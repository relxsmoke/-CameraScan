package Zerocheng.CameraScan;
import android.content.Intent;
import android.net.Uri;
import android.service.quicksettings.TileService;

public class zhifubaofukuanmaActivity extends TileService{
		@Override
		//支付宝付款码
		public void onClick ( )
			{
				super.onClick ( );
				Intent intent = new Intent();
				intent.setData(Uri.parse("alipayqr://platformapi/startapp?saId=20000056"));
				startActivity(intent);
			}
}
