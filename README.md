# appinventor-extension-costycnc

inspired from http://kio4.com/appinventor/125B_extensiones_crear_i.htm

download java https://www.oracle.com/java/technologies/javase-jdk8-downloads.html

download apache http://ant.apache.org/bindownload.cgi

download git  https://git-scm.com/download

download appinventor kit from here  https://github.com/mit-cml/appinventor-sources

install java and git ... unzip apache and appinventor

set manually windows variable or create batch script :

                 SETLOCAL
                 SETX _JAVA_OPTIONS "-Xmx1024m"
                 SETX ANT_HOME "E:\AppInventorExtensiones\apache-ant-1.10.8-bin"
                 SETX ANT_OPTS  "-Xmx256M"
                 SETX JAVA_HOME "C:\Program Files\Java\jdk1.8.0_131" 
                 SETX CLASSPATH "%ANT_HOME%\lib;%JAVA_HOME%\lib"
                 SETX PATH ";%ANT_HOME%\bin;%JAVA_HOME%\bin"
                 pause 0
                 
 Modify  E:\AppInventorExtensiones\apache-ant-1.10.8-bin and C:\Program Files\Java\jdk1.8.0_131  with correct path 
 
 run this batch file 2-3 times ... because i see that if is executed one time thre variables is not set corectly 
 
 now open folder 
                 
