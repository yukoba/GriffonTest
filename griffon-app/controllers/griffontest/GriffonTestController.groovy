package griffontest

import javax.swing.event.TreeSelectionEvent
import javax.swing.event.TreeSelectionListener
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.DefaultTreeModel
import java.awt.event.ActionEvent

class GriffonTestController {
    // these will be injected by Griffon
    GriffonTestModel model
    def view

    DefaultMutableTreeNode rootNode
    DefaultTreeModel treeModel

    void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
        model.count = "0"

        // ラベルの更新
        updateCountLabel()

        // 木の初期化
        rootNode = new DefaultMutableTreeNode("追加した数")
        treeModel = new DefaultTreeModel(rootNode)
        view.numberTree.model = treeModel
        view.numberTree.addTreeSelectionListener(onTreeClick as TreeSelectionListener)
    }

    // void mvcGroupDestroy() {
    //    // this method is called when the group is destroyed
    // }

    /*
        Remember that actions will be called outside of the UI thread
        by default. You can change this setting of course.
        Please read chapter 9 of the Griffon Guide to know more.
    */
    def onInc = { ActionEvent evt = null ->
        model.count = ((model.count as int) + 1) as String

        // ラベルの更新
        updateCountLabel()

        // 木への追加
        treeModel.insertNodeInto(new DefaultMutableTreeNode(model.count), rootNode, rootNode.childCount)
        view.numberTree.expandRow(0)
    }

    void updateCountLabel() {
        edt {
            view.countLabel.text = model.count
        }
    }

    def onTreeClick = { TreeSelectionEvent evt ->
        println "Tree click: ${evt.path.lastPathComponent}"
    }
}
