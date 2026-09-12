package org.firstinspires.ftc.teamcode.robot

import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.hardware.DcMotorEx

class Intake(
    val motor: DcMotorEx
) {
    var power
        get() = motor.power
        set(value) {
            motor.power = value
        }

    fun getPower(): Double {
        return motor.power
    }
    fun setPower(value : Double) {
        motor.power = value
    }

    fun startIntake() { power = 1.0 }
    fun stopIntake() { power = 0.0 }
    fun spew() { power = -1.0 }

}