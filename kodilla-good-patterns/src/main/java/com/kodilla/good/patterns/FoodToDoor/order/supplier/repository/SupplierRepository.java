package supplier.repository;

import supplier.Supplier;

public interface SupplierRepository {
    Supplier getSupplier(String name);
}
