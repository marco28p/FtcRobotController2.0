package org.firstinspires.ftc.teamcode.internals.input

class TwoWayToggleInput(
) {
    private var pressed: Boolean = false
    private var state: Double = 0.0
    fun input(
        button: () -> Boolean,
        idle: Double = 0.0,
        power: Double = 1.0,
    ){
        if(button() && !pressed){
            state = power
            pressed = true
        }
        if(button() && pressed){
            state = idle
            pressed = false
        }
    }
}