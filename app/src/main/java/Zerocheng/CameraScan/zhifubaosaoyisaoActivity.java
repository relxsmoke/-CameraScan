package Zerocheng.CameraScan;
import android.content.Intent;
import android.net.Uri;
import android.service.quicksettings.TileService;

public class zhifubaosaoyisaoActivity extends TileService{
		@Override
		public void onClick ( )
			{
				//支付宝扫一扫
				super.onClick ( );
				Intent intent = new Intent();
				intent.setData(Uri.parse("alipayqr://platformapi/startapp?saId=10000007"));
				startActivity(intent);
			}
}
