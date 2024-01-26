package factory_method.idcard;

import factory_method.framework.Factory;
import factory_method.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private final List<String> owners;

    public IDCardFactory() {
        owners = new ArrayList<>();
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        String owner = ((IDCard) product).getOwner();
        owners.add(owner);
    }

    public List<String> getOwners() {
        return owners;
    }
}
