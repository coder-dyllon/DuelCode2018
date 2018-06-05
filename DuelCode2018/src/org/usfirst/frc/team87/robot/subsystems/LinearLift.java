package org.usfirst.frc.team87.robot.subsystems;

import org.usfirst.frc.team87.robot.commands.LiftUp;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team87.robot.OI;

/**
 *
 */
public class LinearLift extends Subsystem {
	
	public LinearLift() {
		
	}
	public void linearliftup() {
		
	}
	
	public void stop() {
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new LiftUp());
    }
    
    public String toString() {
    	if(!leftMotor.get && !rightMotor.get()) {
    		return("Fully Lowered");
    	} else if(!leftMin.get() && !rightMin.get()) {
    		return("Fully Raised");
    	}
    	
    }
}

