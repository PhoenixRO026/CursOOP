package org.firstinspires.ftc.teamcode.robot

import com.pedropathing.follower.Follower
import com.pedropathing.math.Pose
import com.qualcomm.robotcore.hardware.DcMotorEx
import com.qualcomm.robotcore.hardware.HardwareMap
import com.qualcomm.robotcore.hardware.Servo
import org.firstinspires.ftc.teamcode.pedro.Constants

class Robot(
    hardwareMap: HardwareMap,
    pose: Pose = Pose(0.0, 0.0, Math.toRadians(0.0))
) {
    val intake : Intake
    val outtake : Outtake
    val follower : Follower = Constants.create(hardwareMap)

    init {
        follower.setPose(pose)
        follower.update()

        val motorIntake = hardwareMap.get(DcMotorEx::class.java, "motorIntake")
        val servoHood = hardwareMap.get(Servo::class.java, "servoHood")

        intake = Intake(
            motor = motorIntake
        )
        outtake = Outtake(
            hood = servoHood
        )
    }
}