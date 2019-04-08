package chris.ivey.discordjava;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountEntity {

    String api;
    String name;
    String world;
    ArrayList<String> guilds;
    ArrayList<String> guild_leader;
    String wvw_rank;
    String discord_uid;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public ArrayList<String> getGuilds() {
        return guilds;
    }

    public void setGuilds(ArrayList<String> guilds) {
        this.guilds = guilds;
    }

    public ArrayList<String> getGuild_leader() {
        return guild_leader;
    }

    public void setGuild_leader(ArrayList<String> guild_leader) {
        this.guild_leader = guild_leader;
    }

    public String getWvw_rank() {
        return wvw_rank;
    }

    public void setWvw_rank(String wvw_rank) {
        this.wvw_rank = wvw_rank;
    }

    public String getDiscord_uid() {
        return discord_uid;
    }

    public void setDiscord_uid(String discord_uid) {
        this.discord_uid = discord_uid;
    }
}
