# FTC14717
FTC Robotics Team 14717

Here are some resources to help you:
First Inspires Resources link:
https://www.firstinspires.org/resource-library/ftc/technology-information-and-resources
Java Tutorials:
https://www.tutorialspoint.com/java/index.htm

Once you have android studio set up, go under the build.gradle file and add the following code under everything.

    allprojects {
        repositories {
            google() // and here
            jcenter()
        }
    }

Then to create your first file go to TeamCode->src->main->java->org.firstinspires.ftc.teamcode
Then right click the file and make a new java class. name it "MyFirstJavaOPMode". Then copy the code into the java class.

Unfortunatly you will not be able to test the code until you have a phone.

    package org.firstinspires.ftc.teamcode;

    import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
    import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

    @TeleOp
    public class MyFirstJavaOpMode extends LinearOpMode {
    
    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
