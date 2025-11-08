; This script sets text into File Upload dialog and presses Open
WinWaitActive("Open")   ; Wait until the popup window with title "Open" appears
Send("C:\Users\User\git\A12-Basic-selenium\A12-selenium-superstar\src\test\resources\TestNG.pdf")  ; Path of file
Send("{ENTER}")         ; Press Enter
