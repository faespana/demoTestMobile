# demoTestMobile 🤖📱

In this practice first, we installed the WDIO dummy app on an Android device 🤖, you can use an emulator created using Android Studio, or use your own Android device if you have one. 

The APK is available for download, link 🔗 https://github.com/webdriverio/native-demo-app/releases 

📜 After the app is correctly installed and working, you will find here 4 scenarios to be fully automated. First of all you have to recreate each step manually in order to understand what is being 
tested and which steps we have to execute. 

This set of tests our team oriented to the navigation of the dummy WebdriverIO application. 

1. Navigation on the bottom menu bar:
   -As a precondition, the user should be on the Home screen.
   -Navigate to each section by tapping their respective icon on the bottom menu bar.
   -After tapping on the respective menu section, assertions should be made in order to check all elements on the respective sections are correctly displayed (Check visibility and properties).

2. Successful Sign Up:
   -As a precondition, the user should be at the login section
   -Navigate to the Signup section.
   -Fill in all the form data to sign up (Consider the test must be able to be executed multiple times, so a random email may be generated each time, or an action should be done after the test to delete the created account).
   -Check if the signup process was successfully completed.

3. Successful Login:
   - As a precondition, the user should be in the Login section and have a previously created user.
   - Navigate to the Login View.
   - Fill in all the form data to log in.
   - Check if the login process was successfully completed.
  
4. Swipe cards on the Swipe section:
   - As a precondition, the user should be in the Swipe section.
   - Perform a right swipe on the cards and check the old card is hidden, the new card is visible, and the respective card dot is selected.
   - Perform a left swipe on the cards and check the old card is hidden, the new card is visible, and the respective card dot is selected.

📌Consider the test cases should be fully independent one from another, so, for example, the login test may reuse code from the signup test, but it may not rely on the signup test to be done 
earlier in order to properly work.
