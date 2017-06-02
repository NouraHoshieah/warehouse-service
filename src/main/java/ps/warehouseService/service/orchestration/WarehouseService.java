/**
 * 
 */
package ps.warehouseService.service.orchestration;

import java.util.List;

import ps.warehouseService.model.Item;
import ps.warehouseService.model.Warehouse;

/**
 * @author rkhalayl
 *
 */
public interface WarehouseService {

	public List<Warehouse> getAllwarehouseServiceWithDetails();

	public Item checkExistence(String itemId);
	
}
