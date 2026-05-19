package Logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompRepairClub {
    private Map<Integer, Repair> repairs;

    public CompRepairClub() {
        repairs = new HashMap<>();
    }

    public void addRepair(Repair repair) {
        repairs.put(repair.getRepairId(), repair);
    }

    public boolean removeRepair(int repairId) {
        if (repairs.containsKey(repairId)) {
            repairs.remove(repairId);
            return true;
        }
        return false;
    }

    public Repair getRepair(int repairId) {
        return repairs.get(repairId);
    }

    public boolean updateRepair(int repairId, String problem, String make,
                                String model, String name, String phone) {
        Repair repair = repairs.get(repairId);
        if (repair == null) {
            return false;
        }

        if (problem != null && !problem.trim().isEmpty()) {
            repair.setProblemDescription(problem);
        }
        if (make != null && !make.trim().isEmpty()) {
            repair.setMake(make);
        }
        if (model != null && !model.trim().isEmpty()) {
            repair.setModel(model);
        }
        if (name != null && !name.trim().isEmpty()) {
            repair.setCustomerName(name);
        }
        if (phone != null && !phone.trim().isEmpty()) {
            repair.setCustomerPhone(phone);
        }

        return true;
    }

    public Set<Integer> getAllRepairIds() {
        return repairs.keySet();
    }

    public boolean isEmpty() {
        return repairs.isEmpty();
    }
}