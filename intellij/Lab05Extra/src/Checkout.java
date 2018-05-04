import java.util.ArrayList;

public class Checkout {
    private ArrayList<DessertItem> desitem = new ArrayList<DessertItem>();
    public void clear(){
        desitem.clear();
    }
    public void enterItem(DessertItem e)
    {
        desitem.add(e);
    }
    public int numberOfItems()
    {
        return desitem.size();
    }
    public int totalCost()
    {
        int total=0;
        for(DessertItem e: desitem)
        {
            total+=e.getCost();
        }
        return total;
    }
    public int totalTax()
    {
        int total=0;
        for(DessertItem e: desitem)
        {
            total+=(int)Math.round(e.getCost()*DessertShoppe.TAX_RATE/100);
        }
        return total;
    }

    public String getDesitem() {
        String name="";
        for(DessertItem e : desitem)
        {
            name+= e.getName()+" "+(double)e.getCost()/100+'\n';
        }
        return name;
    }

    @Override
    public String toString() {
        return ""+getDesitem()+"\n"+"Tax "+(double)totalTax()/100+'\n'+"Total Cost "+(double)(totalCost()+totalTax())/100+'\n';
    }
}
