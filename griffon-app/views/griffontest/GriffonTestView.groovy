package griffontest

application(title: 'GriffonTest',
        preferredSize: [320, 80],
        pack: true,
        locationByPlatform: true,
        iconImage: imageIcon('/griffon-icon-48x48.png').image,
        iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                     imageIcon('/griffon-icon-32x32.png').image,
                     imageIcon('/griffon-icon-16x16.png').image]) {
    gridLayout(cols: 2, rows: 1)

    textField(columns: 20, text: bind { model.count })
    button('increment', actionPerformed: controller.onInc)
}
