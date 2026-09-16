package org.firstinspires.ftc.teamcode.robot

import com.qualcomm.robotcore.hardware.Servo

class Outtake(
    val hood : Servo
) {
    var position
        get() = hood.position
        set(value) {
            hood.position = value.coerceIn(0.75, 1.0)
        }

    fun hoodDown() { position = 0.75 }
    fun hoodUp() { position = 1.0 }
}