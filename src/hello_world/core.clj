(ns hello_world.core)
(import 'com.trolltech.qt.gui.QApplication
        'com.trolltech.qt.gui.QPushButton)
(defn -main [] 
  (QApplication/initialize (into-array [""]))
  (.show (new QPushButton "Hello World"))
  (QApplication/exec)
  )