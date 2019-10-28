package org.usfirst.frc4904.robot;

import org.usfirst.frc4904.robot.commands.ExampleCommand;
import org.usfirst.frc4904.standard.CommandRobotBase;

public class Robot extends CommandRobotBase {
	RobotMap map = new RobotMap();

	@Override
	public void initialize() {
	}

	@Override
	public void teleopInitialize() {
		teleopCommand = new ExampleCommand();
		teleopCommand.start();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopExecute() {
	}

	@Override
	public void autonomousInitialize() {
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousExecute() {
	}

	/**
	 * This function is called periodically in every robot mode
	 */
	@Override
	public void alwaysExecute() {
	}

	@Override
	public void disabledInitialize() {
	}

	@Override
	public void disabledExecute() {
	}

	@Override
	public void testInitialize() {
	}

	@Override
	public void testExecute() {
	}
}