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
    textField(columns: 20, text: bind { model.count }, constraints: "wrap", editable: false)

    button('increment', actionPerformed: controller.onInc, constraints: "span 2, right")
}
