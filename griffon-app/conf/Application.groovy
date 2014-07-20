application {
    title = 'GriffonTest'
    startupGroups = ['griffonTest']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "griffonTest"
    'griffonTest' {
        model      = 'griffontest.GriffonTestModel'
        view       = 'griffontest.GriffonTestView'
        controller = 'griffontest.GriffonTestController'
    }

}
