PET SELECTION

HOW CODE WORKS:
The application has five radio button representing the pets. When someone selects a pet the corresponding pet image is displayed in a message box.

Imports:
The code starts by importing all the necessary java swing and AWT clases which are used to create grapgic user interface for the application.

PET CLASS:
It extends the ‘JFrame’ class which is the main window for the application.
It implements the ‘ActionListener’ interface , which allows the class to handle events generated by the GUI components.

CONSTRUCTOR:
• setDefaultCloeOperation(JFrame.EXIT_ON_CLOSE) – this sets the default close operation for the window to exit the application when the window was closed.
• setLayout(new BorderLayout(10,10 )) – sets the layout manager for the window to ‘BorderLayout’ with a horizontal and vertical gap of 10px.
• setTitle(“pet selector”) – sets the title of the window.
• setsize(400,300) – sets the size of the window.
• ImageIcon – object for the pet images.
• JRadioButtons – object for each pet type.
• ButtonGroup – ensures that only one pet can be selected at a time.
• ActionListener – adds the radio button to the class.
• JLable – displays the selected pet image.
• JPanel – created with a ‘GridLayout’ to hold radio buttons.
• Radio panel is added to the left and the message label is added to the center of the window. 

actionPerformed(ActionEvent e) Method:
Method is called upon when a radio button is clicked, it checks the radio button clicked and sets the icon of the message label correctly.

Main Method:
Creates an instance of the pet class which starts the application.

