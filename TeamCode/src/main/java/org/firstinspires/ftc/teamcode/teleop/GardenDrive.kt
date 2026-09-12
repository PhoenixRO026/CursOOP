package org.firstinspires.ftc.teamcode.teleop

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import org.firstinspires.ftc.teamcode.robot.Robot

class GardenDrive : LinearOpMode() {
    override fun runOpMode() {
        val robot = Robot(hardwareMap)

        waitForStart()

        while (opModeIsActive()) {
            robot.follower.manual(
                -gamepad1.left_stick_y.toDouble(),
                -gamepad1.left_stick_x.toDouble(),
                -gamepad1.right_stick_x.toDouble()
            )
            robot.follower.update()
        }
    }
}