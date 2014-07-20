package griffontest

import java.awt.event.ActionEvent

class GriffonTestController {
    // these will be injected by Griffon
    GriffonTestModel model
    def view

    void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
        model.count = "0"
        updateCountLabel()
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
        updateCountLabel()
    }

    void updateCountLabel() {
        edt {
            view.countLabel.text = model.count
        }
    }
}
