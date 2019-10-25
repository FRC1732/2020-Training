/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

<<<<<<< HEAD
import edu.wpi.first.wpilibj.command.Subsystem;
=======
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

>>>>>>> sstone_training

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
<<<<<<< HEAD
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
=======

  private TalonSRX LeftMaster = new TalonSRX(RobotMap.DRIVETRAIN_LEFTMASTER_ID);
  private TalonSRX RightMaster = new TalonSRX(RobotMap.DRIVETRAIN_RIGHTMASTER_ID);
  private TalonSRX Left1 = new TalonSRX(RobotMap.DRIVETRAIN_LEFT1_ID);
  private TalonSRX Left2 = new TalonSRX(RobotMap.DRIVETRAIN_LEFT2_ID);
  private TalonSRX Right1 = new TalonSRX(RobotMap.DRIVETRAIN_RIGHT1_ID);
  private TalonSRX Right2 = new TalonSRX(RobotMap.DRIVETRAIN_RIGHT2_ID);


  public Drivetrain(){
    LeftMaster.setInverted(true);
    RightMaster.setInverted(true);
    Left1.setInverted(true);
    Left2.setInverted(true);
    Right1.setInverted(true);
    Right2.setInverted(true);

    

    Left1.follow(LeftMaster);
    Left2.follow(LeftMaster);
    Right1.follow(RightMaster);
    Right2.follow(RightMaster);
  }

  public void set(double left, double right){
    LeftMaster.set(ControlMode.PercentOutput, left);
    RightMaster.set(ControlMode.PercentOutput, right);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void stop(){
    LeftMaster.set(ControlMode.PercentOutput, 0);
    RightMaster.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void initDefaultCommand() {

    // Set the default command for a subsystem here.`
>>>>>>> sstone_training
    // setDefaultCommand(new MySpecialCommand());
  }
}
