# FTC14717
FTC Robotics Team 14717

Here are some resources to help you:
First Inspires Resources link:
https://www.firstinspires.org/resource-library/ftc/technology-information-and-resources
Java Tutorials:
https://www.tutorialspoint.com/java/index.htm

TensorFlow:
https://github.com/google/ftc-object-detection

Tensor Flow Op Mode:
https://github.com/ftctechnh/ftc_app/wiki/Java-Sample-TensorFlow-Object-Detection-Op-Mode

Vuforia Key:
Aee3IwT/////AAABmUPHs0IW4kz/viGy76aZXMQkMGeo5EFXC+SUmupKBZzxWomke76D3lprzs3nsV0NfI9n9Y1+K1P0zQzAt3dfGRlcVOXflRjS81+/VLc2XkZ52ZJW7ZeQhg2Q2xgZUGhpQVZwvgX4Q1p8iW5iELCxkuQivPJ7k6cCqTM7wSFRJMmXqG7lFS4oa1vv6+yL8C0fvOkXZLh8ifrOzzQ+3ZUvEx/SrSM4mNAMbMfYEPE9JVGcTUOqoNkfe3ALWl6EfT7lJHxAn3Ae4KTAIfPtdcajQehTkRiqnf8mFQUEWDZFk8GZknSoZfyiaarqIUZBHvaSO9RyYCZUnI9y+zEh65S7TuR49DJCrT30uRY4QyuVfizT

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
    
    
    Android Studio Fix:
    https://stackoverflow.com/questions/51222065/android-studio-sdk-manager-is-missing
