package HW5_task2;

public class UserPresenter {
    private User user;
    private UserView view;

    public UserPresenter(User user, UserView view) {
        this.user = user;
        this.view = view;
    }

    public void registerUser() {
        String name = view.getInput("Введите ваше имя");
        String login = view.getInput("Введите ваш логин");
        String password = view.getInput("Введите пароль");

        user = new User(name, login, password);
        user.setName(name);
        user.setLogin(login);
        user.setPassword(password);
        user.saveToFile("users.txt");

        view.showMessage("Вы успешно зарегистрировались");
    }

    public void loginUser() {
        String login = view.getInput("Введите логин");
        String password = view.getInput("Введите пароль");

        if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
            view.showMessage("Вы успешно вошли");
        } else {
            view.showMessage("Неправельно введён пароль или логин");
        }
    }

    public void changePassword() {
        String oldPassword = view.getInput("Введите старый пароль: ");
        String newPassword = view.getInput("Введите новый пароль: ");

        if (oldPassword.equals(user.getPassword())) {
            user.setPassword(newPassword);
            user.saveToFile("users.txt");
            view.showMessage("Пароль изменён успешно");
        } else {
            view.showMessage("Неправильно введён пароль");
        }
    }
}