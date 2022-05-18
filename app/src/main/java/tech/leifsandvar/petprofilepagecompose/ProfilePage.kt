package tech.leifsandvar.petprofilepagecompose


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ProfilePage() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .padding(10.dp)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally) {

                Image(painter = painterResource(id = R.drawable.kitty),
                    contentDescription = "Mr Kitty as a kitten",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                        .border(
                            width = 2.dp,
                            color = Color.Red,
                            shape = CircleShape)
                )
                Text(text = "Mr Kitty",
                    fontWeight = FontWeight.Bold)
                Text(text = "Living the Good life in this tree",
                    fontWeight = FontWeight.ExtraLight)
            }
        }
        Row(
            modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        Arrangement.SpaceAround
        ) {
            ProfileStats("150", "Posts")
            ProfileStats(count = "50", title = "Followers")
            ProfileStats(count = "1", title = "Following")
        }
    }


}


@Composable
fun ProfileStats(count: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = title)
        Text(text = count, fontWeight = FontWeight.Bold)

    }

}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview() {
    ProfilePage()
}