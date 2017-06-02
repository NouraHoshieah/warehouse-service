/**
 * 
 */
package ps.warehouseService.service.orchestration;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ps.warehouseService.model.Employee;
import ps.warehouseService.model.Item;
import ps.warehouseService.model.Warehouse;

/**
 * @author rkhalayl
 *
 */
public class WarehouseServiceImpl implements WarehouseService{

	final static Logger logger = Logger.getLogger(WarehouseServiceImpl.class);

	@Override
	public List<Warehouse> getAllwarehouseServiceWithDetails() {
		List<Warehouse> warehouseService = new ArrayList<Warehouse>();

		warehouseService.add(new Warehouse("1", "Ramallah", "12/06/2017", new Employee("01", "Ammerr", "Ramallah", "022956325", "test@test.com", "ComCom", "Nothing notes")));
		warehouseService.add(new Warehouse("2", "Birzeit", "12/04/2017", new Employee("02", "Mhn", "Ramallah", "022956325", "test@test.com", "ComCom", "Nothing notes")));
		warehouseService.add(new Warehouse("3", "Nablus", "12/05/2017", new Employee("03", "Rami", "Ramallah", "022956325", "test@test.com", "ComCom", "Nothing notes")));
		
		return warehouseService;
	}

	@Override
	public Item checkExistence(String itemId) {
		if (itemId.equals("01")){
			return new Item("01", "T-Shirt", 30, "Piece", 100, 40, "Local T-Shirt", "0.05");			
		} else
			if (itemId.equals("02")){
				return new Item("02", "Item two", 60, "Piece", 180, 20, "Local Item two", "0.5");
			} else 
			if (itemId.equals("03")){
				return new Item("03", "Item two", 60, "Piece", 180, 20, "Local Item two", "0.5");
			} else 
			if (itemId.equals("04")){
				return new Item("04", "Item two", 60, "Piece", 180, 20, "Local Item two", "0.5");
			}
		
		return null;
		}
}
