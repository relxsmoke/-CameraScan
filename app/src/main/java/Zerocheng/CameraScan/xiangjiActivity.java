package Zerocheng.CameraScan;
import android.content.Intent;
import android.service.quicksettings.TileService;

public class xiangjiActivity extends TileService{
		@Override
		//相机
		public void onClick ( )
			{
				super.onClick ( );
				Intent intent= new Intent();
				intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
				startActivity(intent);
			}
}
