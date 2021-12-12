// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
   int rperiodic = 0; 
   int aperiodic = 0; 
   int tperiodic = 0; 
   int ainit; 
   int tinit; 

  @Override
  public void robotInit() {
System.out.println("Robot Has Initialized");
  }
  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    rperiodic += 1;  
    System.out.println(rperiodic);
}
  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
  @Override
  public void autonomousInit() {
System.out.println("Starting Autonomous");
aperiodic = 0; 
ainit += 1; 
  }
  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
aperiodic += 1; 
System.out.println(ainit + "," + aperiodic);
  }
  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {
    System.out.println("Starting Teleop");
    tperiodic = 0; 
    tinit += 1; 
  }

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    tperiodic += 1; 
System.out.println(tinit + "," + tperiodic);
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}
}
