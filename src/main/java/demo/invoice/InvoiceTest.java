package demo.invoice;

/**
 *
 */
public class InvoiceTest {
	public static void main(String[] args) {
		int invoiceType=8;
		updateInvoice(invoiceType);

	}

	public static void updateInvoice(int invoiceType){
		Invoice invoice=new Invoice();
		//根据不同的发票类型生成不同的发票服务
		InvoiceService invoiceService=null;
		if(invoiceType==8) {
			 invoiceService=new InvoiceServiceAir();
		}else if(invoiceType==9){
			 invoiceService=new InvoiceServiceTrain();
		}
		invoiceService.updateInvoice();


	}

}
