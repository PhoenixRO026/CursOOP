package org.firstinspires.ftc.teamcode.robot

import com.qualcomm.robotcore.hardware.Servo

class Outtake(
    val hood : Servo
) {
    var position
        get() = hood.position
        set(value) {
            hood.position = value.coerceIn(0.2, 0.8)
        }
}