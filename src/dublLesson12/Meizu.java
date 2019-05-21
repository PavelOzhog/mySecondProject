package dublLesson12;

public class Meizu implements Phone, PhotoCamera {
    @Override
    public void call() {
        System.out.println("телефон звонит....");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("телефон отпраляет сообщение");
    }

    @Override
    public void doPhoto() {
        System.out.println("делаем фотографию...");
    }

    @Override
    public void doVideo() {
        System.out.println("делаем видео");
    }
}
