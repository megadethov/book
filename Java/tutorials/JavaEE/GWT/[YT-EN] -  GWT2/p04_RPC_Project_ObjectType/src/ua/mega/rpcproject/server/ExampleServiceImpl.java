package ua.mega.rpcproject.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.mega.rpcproject.client.model.ImagesList;
import ua.mega.rpcproject.client.model.PersonalInfo;
import ua.mega.rpcproject.client.service.ExampleService;

public class ExampleServiceImpl extends RemoteServiceServlet implements ExampleService {

    @Override
    public String sayHello(String name) {
        String greeting = "Hello " + name;
        return greeting;
    }

    @Override
    public int addTwoNums(int a, int b) {
        int sum = a + b;
        return sum;
    }

    @Override
    public PersonalInfo getPersonalInfo(String familyName) {
        PersonalInfo bioData = new PersonalInfo();
        bioData.setName("Tom Araya");
        bioData.setAge(42);
        bioData.setGender("Male");

        return bioData;
    }

    @Override
    public ImagesList getImages() {
        ImagesList imagesList = new ImagesList();
        String[] images = new String[2];
        images[0] = "img/oracle.png";
        images[1] = "img/postgres.png";
        imagesList.setImages(images);

        return imagesList;
    }
}