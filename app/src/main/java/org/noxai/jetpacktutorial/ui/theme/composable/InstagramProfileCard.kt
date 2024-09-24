package org.noxai.jetpacktutorial.ui.theme.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.noxai.jetpacktutorial.R
import org.noxai.jetpacktutorial.ui.theme.JetpackTutorialTheme

@Composable
fun InstagramProfileCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(topStart = 5.dp, topEnd = 5.dp),
        colors = CardDefaults.cardColors(),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)


    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier

                    .clip(CircleShape)
                    .size(40.dp)
            )



            UserStatistics(title = "Posts", value = "10")
            UserStatistics(title = "Followers", value = "100, 000")
            UserStatistics(title = "Following", value = "100")


        }

        Column(
            modifier = Modifier
                .padding(start = 20.dp)
        ) {

            Text(
                text = "Instagram",
                fontFamily = FontFamily.Cursive,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "#YoursToMake",
                fontSize = 14.sp,
            )


            Text(
                text = "Какая-то ссылка",
                fontSize = 14.sp
            )


            Button(onClick = {}) {
                Text(text = "Follow")
            }
        }
    }

}

@Composable
fun UserStatistics(
    title: String,
    value: String
) {
    Column(
        modifier = Modifier.height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {

        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun DarkThemeStyle() {
    JetpackTutorialTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}

@Preview(showBackground = true)
@Composable
private fun LightThemeStyle() {
    JetpackTutorialTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}