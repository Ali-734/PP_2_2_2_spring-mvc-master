package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    public CarServiceImpl() {
        this.carList = new ArrayList<>();
        this.carList.add(new Car("daewoo", "rus", 734));
        this.carList.add(new Car("bmw", "de", 705));
        this.carList.add(new Car("mercedes", "de", 333));
        this.carList.add(new Car("kia", "kor", 222));
        this.carList.add(new Car("Li", "chin", 133));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
