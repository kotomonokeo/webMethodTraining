package training;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class javaServices

{
	// ---( internal utility methods )---

	final static javaServices _instance = new javaServices();

	static javaServices _newInstance() { return new javaServices(); }

	static javaServices _cast(Object o) { return (javaServices)o; }

	// ---( server methods )---




	public static final void demoDoc1JavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(demoDoc1JavaService)>> ---
		// @sigtype java 3.5
		// [i] recref:0:required demoDoc training.docs:demoDoc
		// [o] recref:0:required outDemoDoc training.docs:outDemoDoc
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
		// demoDoc
		IData demoDoc = IDataUtil.getIData(pipelineCursor, "demoDoc");
		if (demoDoc != null) {
		    IDataCursor demoDocCursor = demoDoc.getCursor();
		
		    // i.demoDoc
		    IData demoDoc_1 = IDataUtil.getIData(demoDocCursor, "demoDoc");
		    if (demoDoc_1 != null) {
		        IDataCursor demoDoc_1Cursor = demoDoc_1.getCursor();
		        String senderID = IDataUtil.getString(demoDoc_1Cursor, "senderID");
		
		        // i.Items
		        IData[] Items = IDataUtil.getIDataArray(demoDoc_1Cursor, "Items");
		        
		        // Create output structure
		        IData outDemoDoc = IDataFactory.create();
		        IDataCursor outDemoDocCursor = outDemoDoc.getCursor();
		        
		        IData outDemoDoc_1 = IDataFactory.create();
		        IDataCursor outDemoDoc_1Cursor = outDemoDoc_1.getCursor();
		        
		        // Copy PONumber and senderID to output
		        IDataUtil.put(outDemoDoc_1Cursor, "senderID", senderID);
		        
		        // Process all items
		        if (Items != null && Items.length > 0) {
		            IData[] outItems = new IData[Items.length];
		            for (int i = 0; i < Items.length; i++) {
		                IDataCursor itemCursor = Items[i].getCursor();
		                String Description = IDataUtil.getString(itemCursor, "Description");
		                String Quantity = IDataUtil.getString(itemCursor, "Quantity");
		                
		                IData outItem = IDataFactory.create();
		                IDataCursor outItemCursor = outItem.getCursor();
		                IDataUtil.put(outItemCursor, "Description", Description);
		                outItemCursor.destroy();
		                
		                outItems[i] = outItem;
		                itemCursor.destroy();
		            }
		            IDataUtil.put(outDemoDoc_1Cursor, "Items", outItems);
		        }
		        
		        outDemoDoc_1Cursor.destroy();
		        IDataUtil.put(outDemoDocCursor, "demoDoc", outDemoDoc_1);
		        outDemoDocCursor.destroy();
		        
		        IDataUtil.put(pipelineCursor, "outDemoDoc", outDemoDoc);
		        
		        demoDoc_1Cursor.destroy();
		    }
		    demoDocCursor.destroy();
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void demoDocJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(demoDocJavaService)>> ---
		// @sigtype java 3.5
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
			// demoDoc
			IData	demoDoc = IDataUtil.getIData( pipelineCursor, "demoDoc" );
			if ( demoDoc != null)
			{
				IDataCursor demoDocCursor = demoDoc.getCursor();
					String	PONumber = IDataUtil.getString( demoDocCursor, "PONumber" );
					String	senderID = IDataUtil.getString( demoDocCursor, "senderID" );
		
					// i.Items
					IData[]	Items = IDataUtil.getIDataArray( demoDocCursor, "Items" );
					if ( Items != null)
					{
						for ( int i = 0; i < Items.length; i++ )
						{
							IDataCursor ItemsCursor = Items[i].getCursor();
								String	Description = IDataUtil.getString( ItemsCursor, "Description" );
								String	Quantity = IDataUtil.getString( ItemsCursor, "Quantity" );
							ItemsCursor.destroy();
						}
					}
				demoDocCursor.destroy();
			}
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		// demoDoc
		IData	demoDoc_1 = IDataFactory.create();
		IDataCursor demoDoc_1Cursor = demoDoc_1.getCursor();
		IDataUtil.put( demoDoc_1Cursor, "senderID", "senderID" );
		
		// demoDoc.Items
		IData[]	Items_1 = new IData[1];
		Items_1[0] = IDataFactory.create();
		IDataCursor Items_1Cursor = Items_1[0].getCursor();
		IDataUtil.put( Items_1Cursor, "Description", "Description" );
		Items_1Cursor.destroy();
		IDataUtil.put( demoDoc_1Cursor, "Items", Items_1 );
		demoDoc_1Cursor.destroy();
		IDataUtil.put( pipelineCursor_1, "demoDoc", demoDoc_1 );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void demoJugaJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(demoJugaJavaService)>> ---
		// @sigtype java 3.5
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
			// demoDoc
			IData	demoDoc = IDataUtil.getIData( pipelineCursor, "demoDoc" );
			if ( demoDoc != null)
			{
				IDataCursor demoDocCursor = demoDoc.getCursor();
					String	PONumber = IDataUtil.getString( demoDocCursor, "PONumber" );
					String	senderID = IDataUtil.getString( demoDocCursor, "senderID" );
		
					// i.Items
					IData[]	Items = IDataUtil.getIDataArray( demoDocCursor, "Items" );
					if ( Items != null)
					{
						for ( int i = 0; i < Items.length; i++ )
						{
							IDataCursor ItemsCursor = Items[i].getCursor();
								String	Description = IDataUtil.getString( ItemsCursor, "Description" );
								String	Quantity = IDataUtil.getString( ItemsCursor, "Quantity" );
							ItemsCursor.destroy();
						}
					}
				demoDocCursor.destroy();
			}
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		
		// demoDoc
		IData	demoDoc_1 = IDataFactory.create();
		IDataCursor demoDoc_1Cursor = demoDoc_1.getCursor();
		IDataUtil.put( demoDoc_1Cursor, "senderID", "senderID" );
		
		// demoDoc.Items
		IData[]	Items_1 = new IData[1];
		Items_1[0] = IDataFactory.create();
		IDataCursor Items_1Cursor = Items_1[0].getCursor();
		IDataUtil.put( Items_1Cursor, "Description", "Description" );
		Items_1Cursor.destroy();
		IDataUtil.put( demoDoc_1Cursor, "Items", Items_1 );
		demoDoc_1Cursor.destroy();
		IDataUtil.put( pipelineCursor_1, "demoDoc", demoDoc_1 );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void myFirstJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(myFirstJavaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required outputString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	inputString = IDataUtil.getString( pipelineCursor, "inputString" );
		pipelineCursor.destroy();
		
		// formula
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "outputString", inputString + "GGWP" );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void mySecondJavaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(mySecondJavaService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputString
		// [o] field:0:required outputString
		// pipeline
		IDataMap idm = new IDataMap(pipeline);
		String inputString = idm.getAsNonEmptyString("inputString");
		
		// do some process
		
		// pipeline
		idm.put("outputString", inputString);
		// --- <<IS-END>> ---

                
	}
}

