package org.firstinspires.ftc.teamcode.Big_Boi_Bot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="tiny turny tire robot thing- close to base", group="Linear Opmode")
public class turny_robot extends LinearOpMode {

    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;
    private DcMotor hook = null;
    //  private DcMotor bucket = null;



    private void turnleft (double degrees){

        runtime.reset();

        double movetime= (degrees/195);
        while (opModeIsActive() && (runtime.time()<movetime)){
            leftDrive.setPower(-1);
            rightDrive.setPower(1);
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("left motor",leftDrive.toString());
            telemetry.addData("right motor", rightDrive.toString());
            telemetry.addData("other thing", runtime.time());
            telemetry.update();
        }
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }
    private void turnright (double degrees){

        runtime.reset();

        double movetime= (degrees/195  );
        while (opModeIsActive() && (runtime.time()<movetime)){
            leftDrive.setPower(1);
            rightDrive.setPower(-1);
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("left motor",leftDrive.toString());
            telemetry.addData("right motor", rightDrive.toString());
            telemetry.addData("other thing", runtime.time());
            telemetry.update();
        }
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }

    private void move (double distance){  //distance is in cm. this function also doesn't account for sliding after motors shut off.

        runtime.reset();

        double movetime= (distance/68);
        while (opModeIsActive() && (runtime.time()<movetime)){
            leftDrive.setPower(1);
            rightDrive.setPower(1);
            telemetry.addData("Status", "Run Time: " + runtime.toString());
            telemetry.addData("left motor",leftDrive.toString());
            telemetry.addData("right motor", rightDrive.toString());
            telemetry.addData("other thing", runtime.time());
            telemetry.update();
        }
        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }

    @Override
    public void runOpMode() {
        //double myTime = Double.parseDouble(runtime);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize the hardware variables. Note that the strings used here as parameters
        // to 'get' must correspond to the names assigned during the robot configuration
        // step (using the FTC Robot Controller app on the phone).
        leftDrive  = hardwareMap.get(DcMotor.class, "motor0");
        rightDrive = hardwareMap.get(DcMotor.class, "motor1");
        hook =hardwareMap.get(DcMotor.class, "motor2");
        //bucket =hardwareMap.get(DcMotor.class, "motor3");

        // Most robots need the motor on one side to be reversed to drive forward
        // Reverse the motor that runs backwards when connected directly to the battery
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        hook.setDirection(DcMotor.Direction.FORWARD);  //direction could be wrong
        // bucket.setDirection(DcMotor.Direction.FORWARD);// direction could be wrong

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            /* use movement here and use the turnleft and turnright functions
            it will end at the end because there's a break*/

            break;
        }
        // Setup a variable for each drive wheel to save power level for telemetry


        // Show the elapsed game time and wheel power.
        telemetry.addData("Status", "Run Time: " + runtime.toString());
        telemetry.addData("left motor",leftDrive.toString());
        telemetry.addData("right motor", rightDrive.toString());
        telemetry.addData("other thing", runtime.time());
        telemetry.update();

    }
}


}
}
