import model.*;
import service.IrancellStore;
import service.MCIStore;
import model.Product;
import service.NetAndChargeStore;

public class Main {
    public static void main(String[] args) {
        MCIStore mciStore = new MCIStore();
        IrancellStore irancellStore = new IrancellStore();
        NetAndChargeStore netChargeStore = new NetAndChargeStore();
        netChargeStore.fillWithOperatorStores(mciStore , irancellStore);
        Product bestOfferedProduct = netChargeStore.getBestOffer();
        System.out.println(bestOfferedProduct.getPrice());
    }
}
