package org.usfirst.frc.team4959.robot;

import org.usfirst.frc.team4959.robot.commands.GearDrop.ShifterOff;
import org.usfirst.frc.team4959.robot.commands.GearDrop.ShifterOn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

	
public class OI {
	public static Joystick xboxController;
	public static Joystick joystick;
	
	public OI() {
	// ***** XBox Controller *****
		xboxController = new Joystick(RobotMap.XBOX_PORT);

				
	// ***** Joystick *****
		joystick = new Joystick(RobotMap.JOYSTICK_PORT);
		
	// Shift Off
		Button shifterOff = new JoystickButton(xboxController, RobotMap.B_BUTTON);
		shifterOff.whenReleased(new ShifterOff());

	// Shifter On
		Button shifterOn = new JoystickButton(xboxController, RobotMap.X_BUTTON);
		shifterOn.whenReleased(new ShifterOn());
	}
	
	public double getUp() {
		return xboxController.getPOV(1);
	}

	public double getDown() {
		return xboxController.getPOV(5);
	}

	// Returns the value of the Left Trigger on the XBOX Controller
	public double getLeftTrigger() {
		return xboxController.getRawAxis(RobotMap.LEFT_TRIGGER);
	}

	// Returns the value of the Right Trigger on the XBOX Controller
	public double getRightTrigger() {
		return xboxController.getRawAxis(RobotMap.RIGHT_TRIGGER);
	}

	// Returns the X-Axis value of the Left Stick on the XBOX Controller
	public double getLeftStickX() {
		return xboxController.getRawAxis(RobotMap.LEFT_X_AXIS);
	}
}
