package griffontest

application(title: 'GriffonTest',
        pack: true,
        locationByPlatform: true,
        iconImage: imageIcon('/griffon-icon-48x48.png').image,
        iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                     imageIcon('/griffon-icon-32x32.png').image,
                     imageIcon('/griffon-icon-16x16.png').image]) {
    migLayout(layoutConstraints: "fill")

    label(text: "回数：", constraints: "left")
    textField(text: bind('count', target: model, mutual: true), columns: 20, editable: true, constraints: "wrap")

    label(text: "回数 from Controller：", constraints: "left")
    label(text: "", id: "countLabel", constraints: "wrap")

    button('increment', actionPerformed: controller.onInc, constraints: "span 2, right")
}
