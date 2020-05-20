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
 
 Now verify if all is ok:
              
                   open folder appinventor , click mouse right and select "Git bash here"
                   
 ![alt text](https://github.com/costycnc/appinventor-extension-costycnc/blob/master/foto/1.jpg)
 
                   write "ant extensions"
                   
  ![alt text](https://github.com/costycnc/appinventor-extension-costycnc/blob/master/foto/2.jpg)       
  
                  if a final received "BUILD SUCCESSFUL" mean that all is ok !!!
                  
  ![alt text](https://github.com/costycnc/appinventor-extension-costycnc/blob/master/foto/3.jpg)                 
                 
What mean this? mean that have compiled none file ... because in folder 

..\appinventor\components\src\com\google\appinventor\components\runtime is not added any new file

Now put Costy.java in this folder and write again "ant extensions" ... and after building will see this

  ![alt text](https://github.com/costycnc/appinventor-extension-costycnc/blob/master/foto/5.jpg)
  
and in appinventor\components\build\extensions will find 

  ![alt text](https://github.com/costycnc/appinventor-extension-costycnc/blob/master/foto/6.jpg)
  
             Download extension on http://ai2.appinventor.mit.edu/
  ![alt text](https://github.com/costycnc/appinventor-extension-costycnc/blob/master/foto/7.jpg)
  
             and ... Congratulations ... you have make first extension that do ... nothing!

  ![alt text](https://github.com/costycnc/appinventor-extension-costycnc/blob/master/foto/8.jpg)
