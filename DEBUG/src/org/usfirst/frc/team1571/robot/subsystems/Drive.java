package org.usfirst.frc.team1571.robot.subsystems;

import org.usfirst.frc.team1571.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
    SpeedController motor = RobotMap.driveSpeedController1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void DriveWithJoystick() {
    	motor.set(1.0);
    }
    
    public void stop() {
    	motor.set(0);
    }
}

