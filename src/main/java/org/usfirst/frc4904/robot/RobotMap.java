package org.usfirst.frc4904.robot;

import org.usfirst.frc4904.standard.custom.controllers.CustomXbox;
import org.usfirst.frc4904.standard.custom.motioncontrollers.CANTalonSRX;
import org.usfirst.frc4904.standard.custom.sensors.PDP;
import org.usfirst.frc4904.standard.subsystems.chassis.TankDrive;
import org.usfirst.frc4904.standard.subsystems.motor.Motor;
import org.usfirst.frc4904.standard.subsystems.motor.speedmodifiers.AccelerationCap;


/**
 * The RobotMap is a map of the physical robot. It stores all port numbers used
 * for all sensors and actuators, which provides flexibility changing wiring and
 * makes checking the wiring easier. Whole-robot metrics such as robot
 * dimensions can also be stored here, But any subsystem-specific constants
 * should be stored in the respective subsystem's class. Finally, this class
 * stores the instances of all the robot's components (subsystems, sensors,
 * motion controllers, controls, etc.).
 */

public class RobotMap {
	public static class Port {
		public static class Motors {
			public static class CAN {
				public static int leftDriveA = 1;
				public static int leftDriveB = 2;
				public static int rightDriveA = 3;
				public static int rightDriveB = 4;
			}
		}

		public static class HumanInput {
			public static final int xboxController = 1;
		}
	}

	public static class Constant {
		public static class HumanInput {
			public static final double Y_SPEED_SCALE = 1;
			public static final double TURN_SPEED_SCALE = 1;
			public static final double XBOX_MINIMUM_THRESHOLD = 0.1;
			public static final double SPEED_GAIN = 1;
			public static final double SPEED_EXP = 2;
			public static final double TURN_GAIN = 1;
			public static final double TURN_EXP = 2;
		}
	}

	public static class Component {
		public static Motor leftWheel;
		public static Motor rightWheel;
		public static TankDrive chassis;
		public static PDP pdp;
	}

	public static class HumanInput {
		public static class Driver {
			public static CustomXbox xbox;
		}
	}

	public RobotMap() {
		Component.pdp = new PDP();
		Component.leftWheel = new Motor("LeftWheel", false, new AccelerationCap(Component.pdp),
			new CANTalonSRX(Port.Motors.CAN.leftDriveA), new CANTalonSRX(Port.Motors.CAN.leftDriveB));
		Component.rightWheel = new Motor("RightWheel", false, new AccelerationCap(Component.pdp),
			new CANTalonSRX(Port.Motors.CAN.rightDriveA), new CANTalonSRX(Port.Motors.CAN.rightDriveB));
//		Component.chassis = new TankDrive("OffseasonChassis", Component.leftWheel, Component.rightWheel);
		HumanInput.Driver.xbox = new CustomXbox(Port.HumanInput.xboxController);
		HumanInput.Driver.xbox.setDeadZone(Constant.HumanInput.XBOX_MINIMUM_THRESHOLD);	}
}