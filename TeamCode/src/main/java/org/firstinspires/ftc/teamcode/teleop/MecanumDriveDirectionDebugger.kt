package org.firstinspires.ftc.teamcode.teleop

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotorEx
import com.qualcomm.robotcore.hardware.HardwareMap

@TeleOp
class MecanumDriveDirectionDebugger : LinearOpMode() {
    override fun runOpMode() {
        val motorRF = hardwareMap.get(DcMotorEx::class.java, "rightFront")
        val motorRB = hardwareMap.get(DcMotorEx::class.java, "rightBack")
        val motorLF = hardwareMap.get(DcMotorEx::class.java, "leftFront")
        val motorLB = hardwareMap.get(DcMotorEx::class.java, "leftBack")

        waitForStart()

        while (opModeIsActive()){

            if(gamepad1.dpad_up) motorRF.power = 0.5 else motorRF.power = 0.0
            if(gamepad1.dpad_right) motorRB.power = 0.5 else motorRB.power = 0.0
            if(gamepad1.dpad_down) motorLB.power = 0.5 else motorLB.power = 0.0
            if(gamepad1.dpad_left) motorLF.power = 0.5 else motorLF.power = 0.0

        }
    }

}