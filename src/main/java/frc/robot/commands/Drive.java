package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveTrain;

public class Drive extends Command {
    private DriveTrain driveTrain;
    private CommandXboxController controller;



    public Drive(DriveTrain driveTrain, CommandXboxController controller) {
        this.driveTrain = driveTrain;
        this.controller = controller;
        this.addRequirements (driveTrain);
        driveTrain.setDefaultCommand(this);
       
    }

    public void execute() {
        driveTrain.drive(controller.getLeftY(), controller.getRightY());
    }
}
