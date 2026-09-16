package org.firstinspires.ftc.teamcode.teleop

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import org.firstinspires.ftc.teamcode.robot.Robot

@TeleOp
class GardenDrive : LinearOpMode() {
    override fun runOpMode() {
        val robot = Robot(hardwareMap)

        waitForStart()

        robot.outtake.hoodDown()

        while (opModeIsActive()) {
            if (gamepad1.right_bumper) {
                robot.intake.startIntake()
            }
            if (gamepad1.left_bumper) {
                robot.intake.stopIntake()
            }
            if (gamepad1.dpad_up) {
                robot.outtake.hoodUp()
            }
            if (gamepad1.dpad_down) {
                robot.outtake.hoodDown()
            }

            robot.follower.manual(
                -gamepad1.left_stick_y.toDouble(),
                -gamepad1.left_stick_x.toDouble(),
                -gamepad1.right_stick_x.toDouble()
            )
            robot.follower.update()
        }
    }
}