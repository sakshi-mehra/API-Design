@RestController
@RequestMapping("/api/v1")
public class EmpController {
    @Autowired
    private EmpRepository empRepository;
    /**
     * Get all users list.
     *
     * @return the list
     */
    @GetMapping("/emps")
    public List<Employee> getAllEmps() {
        return empRepository.findAll();
    }
    /**
     * Gets employee by name.
     *
     * @param name the emp name
     * @return the emps by name
     * @throws ResourceNotFoundException the resource not found exception
     */
    @GetMapping("/emps/{name}")
    public ResponseEntity<Employee> getEmpsByName(@PathVariable(value = "id") String name)
            throws ResourceNotFoundException {
        Employee employee =
                empRepository
                        .findByName(name)
                        .orElseThrow(() -> new ResourceNotFoundException("Employee not found on :: " + name));
        return ResponseEntity.ok().body(emp);
    }
    /**
     * Create employee emp.
     *
     * @param employee the emp
     * @return the employee
     */
    @PostMapping("/emps")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return empRepository.save(employee);
    }
    /**
     * Update user response entity.
     *
     * @param name the employee name
     * @param employeeDetails the employee details
     * @return the response entity
     * @throws ResourceNotFoundException the resource not found exception
     */
    @PutMapping("/emps/{name}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable(value = "name") String EmployeeName, @Valid @RequestBody Employee empDetails)
            throws ResourceNotFoundException {
        Employee employee =
                empRepository
                        .findById(name)
                        .orElseThrow(() -> new ResourceNotFoundException("Employee not found on :: " + name));
        employee.setName(empDetails.getName());
        employee.setHomePhone(empDetails.getHomePhone());
        employee.setState(empDetails.getState());
        employee.setHireDate(empDetails.getHireDate());
        final Employee updatedEmployee = empRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
    /**
     * Delete employee map.
     *
     * @param name the employee name
     * @return the map
     * @throws Exception the exception
     */
    @DeleteMapping("/emp/{name}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "name") String name) throws Exception {
        Employee employee =
                empRepository
                        .findByName(name)
                        .orElseThrow(() -> new ResourceNotFoundException("Employee not found on :: " + name));
        empRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}