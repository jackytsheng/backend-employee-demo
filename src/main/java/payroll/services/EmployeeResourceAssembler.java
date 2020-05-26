package payroll.services;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import payroll.controller.EmployeeController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EmployeeResourceAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {
  @Override
  public EntityModel<Employee> toModel(Employee employee){
    return new EntityModel<>(employee, linkTo(methodOn(EmployeeController.class).all()).withRel("employees"),
        linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel());
  }
}
