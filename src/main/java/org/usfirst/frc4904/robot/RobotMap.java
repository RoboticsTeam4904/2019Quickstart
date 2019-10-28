package org.usfirst.frc4904.robot;

import org.usfirst.frc4904.standard.custom.sensors.PDP;

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
		public static class HumanInput {

		}

		public static class CANMotor {

		}

		public static class PWM {

		}

		public static class CAN {

		}

		public static class Pneumatics {

		}

		public static class Digital {

		}
	}

	public static class Metrics {
		public static class Chassis {

		}
	}

	public static class PID {
		public static class Drive {

		}

		public static class Turn {

		}
	}

	public static class Component {
		public static PDP pdp;
	}

	public static class Input {

	}

	public static class HumanInput {
		public static class Driver {

		}

		public static class Operator {

		}
	}

	public RobotMap() {
		Component.pdp = new PDP();
	}
}