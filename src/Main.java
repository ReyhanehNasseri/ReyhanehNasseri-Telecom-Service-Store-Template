import model.*;
import service.*;
import model.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MCIStore mciStore = new MCIStore();
        IrancellStore irancellStore = new IrancellStore();
        NetAndChargeStore netChargeStore = new NetAndChargeStore();
        netChargeStore.fillWithOperatorStores(mciStore , irancellStore);
        System.out.println(netChargeStore.getChargeStorageCount());
        System.out.println(netChargeStore.getInternetPackageStorageCount());
        System.out.println(netChargeStore.getCustomerStorageCount());
    }
}
