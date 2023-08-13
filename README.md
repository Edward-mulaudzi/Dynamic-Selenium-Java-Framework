
# Framework Coding standard

## Property files
    # The url is stored in here
    # The browser to be launched is selected here
## Pages
### Page Objects are created inside this package
* SamplePage
        

    # Create a Page Object Class
    # Create a Constructor
    # Extend The BaseClass to get Instance of the WebDriver
    # Create private Variables for the Page Elements
    # Create public Methods/Functions for the action performed on the Page

## Page Objects Repository
* This Class Enables you to access functions inside the PageObject 
  without creating an instance of the object 
        

    # Declare a public static variable for the Page Object Inside the PageObjecsRepository Class
    # Create an Instance of the Page Object Inside the createPageInstance() function

## Reusable Methods
    # Create common functions here


