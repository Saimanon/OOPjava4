package less4.controller;

import less4.model.Teatcher;
import less4.model.User;
import less4.service.TeacherService;
import less4.view.TeacherView;
import less4.view.UserView;

import java.util.List;

public class TeacherController implements UserController {

    private UserView<Teatcher> view = new TeacherView();
    private TeacherService service = new TeacherService();

    @Override
    public <T extends User> User create(T user) {
        return service.createTeacher(user.getId(), user.getName(), user.getLastName());
    }

    public void sendOnConsole(List<Teatcher> teachers) {
        view.sendOnConsole(teachers);
    }

    public void updateTeacher(int id, String name, String lastName) {
        // Логика обновления учителя
        Teatcher teacher = service.createTeacher(id, name, lastName);
    }
}